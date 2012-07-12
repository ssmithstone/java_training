package jedi_training;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void newCalculator() throws Exception {
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

    @Test
    public void calculatorCanReceiveInput() throws Exception {
        new Calculator().input(0);
    }

    @Test
    public void calculatorReturnsValue() throws Exception {
        assertThat(new Calculator().output(), equalTo(0));
    }
}


