package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;

import java.util.ArrayList;
import java.util.List;

public abstract class  SequentialAbstractDeduction implements Meter {

    private Integer turn = null;
    private Integer position = 0;
    private Integer total = 0;
    private List<Occurrence> validated = new ArrayList<Occurrence>();

    @Override
    public Integer calculate(String password) {
        String lowerCase = password.toLowerCase();
        for (; position < lowerCase.length(); position++){
            if(rangeOnly(lowerCase, position)){
                isNextCharacter(lowerCase);
                final StringBuilder textValidated = new StringBuilder(lowerCase.substring(position - total, position + 1));
                Boolean notExistOcurrence = this.validated.stream().filter(item -> item.existInformation(textValidated)).findFirst().map(item -> Boolean.FALSE).orElse(Boolean.TRUE);
                if(total > 2 && notExistOcurrence){
                    Occurrence item = new Occurrence(textValidated.toString(), total - 1);
                    this.validated.add(item);
                }
                total = 0;
            }
        }
        Integer result = this.validated.stream().filter(this::validateStartString).mapToInt(itemReference -> itemReference.total).sum();
        return Math.negateExact(result * 3);
    }


    private void isNextCharacter(String lowerCase) {
        if(lowerCase.length() > position + 1 && (lowerCase.charAt(position + 1) - lowerCase.charAt(position) == 1 || lowerCase.charAt(position + 1) - lowerCase.charAt(position) == -1)){
            Integer tempTurn = lowerCase.charAt(position + 1) - lowerCase.charAt(position);
            turn = turn == null ? tempTurn : turn;
            if(turn == tempTurn){
                total++;
                position++;
                this.isNextCharacter(lowerCase);
            }
        }
    }

    abstract protected boolean rangeOnly(String lowerCase, Integer position) ;

    private boolean validateStartString(Occurrence itemReference) {
        return this.validated.stream()
                .filter(itemList -> itemList.information.length() > itemReference.information.length() && (itemList.information.contains(itemReference.information)
                                    || itemList.information.contains(itemReference.getReverseInformation())))
                .findFirst().map(item -> false).orElse(true);
    }
}

class Occurrence {
    String information;
    Integer total;

    public Occurrence(String information, Integer total){
        this.information = information;
        this.total = total;
    }

    public boolean existInformation(StringBuilder information) {
        return information.toString().equals(this.information) || information.reverse().toString().equals(this.information);
    }

    public String getReverseInformation(){
        return new StringBuilder(information).reverse().toString();
    }
}