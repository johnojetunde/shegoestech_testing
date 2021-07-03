package com.shegoestech;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
class UnicornsTest {

    @Mock
    private NumberOperator numberOperator;
    @InjectMocks
    private Unicorns unicorns;

//    @BeforeEach
//    void setUp() {
//        numberOperator =  Mockito.mock(NumberOperator.class);
//        unicorns =  new Unicorns(numberOperator);
//        MockitoAnnotations.openMocks(this);
    //PowerMockito -  mocking static classes and constructors
    //assertJ - easy and chainable assertions

//    }

    @Test
    void whenOperationResultIsEven() {
        Mockito.when(numberOperator.add(anyInt(), anyInt()))
                .thenReturn(4);

        String message = unicorns.additionPrinter(2, 2);
        assertEquals(
                "Yeaaah!!, the result is an even number",
                message);
    }

    @Test
    void whenOperatorResultIsOdd() {
        Mockito.when(numberOperator.add(anyInt(), anyInt()))
                .thenReturn(5);

        String message = unicorns.additionPrinter(1, 2);
        assertEquals(
                "Ooops!!! an odd number is here",
                message);
    }
}