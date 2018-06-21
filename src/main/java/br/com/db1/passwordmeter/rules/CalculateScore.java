package br.com.db1.passwordmeter.rules;

import br.com.db1.passwordmeter.rules.additions.*;
import br.com.db1.passwordmeter.rules.deductions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculateScore {

    private static final List<Meter> LIST_METRICS = new ArrayList<>();

    static {
        LIST_METRICS.addAll(Arrays.asList(
                new LowerLettersAddition(),
                new MiddleNumbersSymbolsAddition(),
                new NumberAddition(),
                new NumberCaractersAddition(),
                new RequirementsAddition(),
                new SymbolsAddition(),
                new UpperLettersAddition()
        ));


        LIST_METRICS.addAll(Arrays.asList(
              new ConsecutiveLowerLettersDeduction(),
              new ConsecutiveNumbersDeduction(),
              new ConsecutiveUpperLettersDeduction(),
              new LettersOnlyDeduction(),
              new NumbersOnlyDeduction(),
              new RepeatCharactersDeduction(),
              new SequentialLettersDeduction(),
              new SequentialNumbersDeduction(),
              new SequentialSymbolsDeduction()
        ));
    }

    public Integer calcBonus(String password){
        return password == null ? 0 : getScore(password);
    }

    private Integer getScore(String password){
        Integer totalScore = LIST_METRICS.stream().mapToInt(rule -> rule.calculate(password)).sum();
        return  totalScore > 100 ? 100 : (totalScore < 0 ? 0 : totalScore);
    }

}
