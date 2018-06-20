package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;

import java.util.ArrayList;
import java.util.List;

public abstract class  SequentialAbstractDeduction implements Meter {

    private Integer turn = null;
    private List<Character> validated = new ArrayList<Character>();

    @Override
    public Integer calculate(String password) {
        //TODO - Verify comportaments

        String lowerCase = password.toLowerCase();
        Integer acumulado = 0;
        Integer result = 0;
        for (int position=0 ;position < lowerCase.length(); position++){
            acumulado = rangeOnly(lowerCase, position) && isNextCharacter(lowerCase, position) ? acumulado+1 : 0;
            result = addResult(acumulado, result, lowerCase, position);
        }
        return result * 3;
    }

    private Integer addResult(Integer acumulado, Integer result, String lowerCase, int position) {
        switch (acumulado){
            case 0:
                this.turn = null;
                break;
            case 1:
                break;
            case 2:
            default:
                this.validated.add(lowerCase.charAt(position));
                this.validated.add(lowerCase.charAt(position-1));
                result += 1 ;
                break;
        }
        return result;
    }

    protected boolean isNextCharacter(String lowerCase, int a) {
        if(lowerCase.length() > a + 1 && !this.validated.contains(lowerCase.charAt(a+1)) && (lowerCase.charAt(a + 1) - lowerCase.charAt(a) == 1 || lowerCase.charAt(a + 1) - lowerCase.charAt(a) == -1)){
            Integer tempTurn = lowerCase.charAt(a + 1) - lowerCase.charAt(a);
            turn = turn == null ? tempTurn : turn;
            return  turn == tempTurn;
        }
        return false;
    }

    abstract protected boolean rangeOnly(String lowerCase, int a) ;
}