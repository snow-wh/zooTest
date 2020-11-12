import animals.Lion;
import food.Chicken;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

import java.io.*;


import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Кормление Хищных Животных")
public class CarnivorousAnimalEatTest {

    private Lion lion;
    private String name = "lion";
    private int weight = 280;

    private PrintStream stream;
    private ArgumentCaptor<String> captor;

    private String FULL_ANIMAL = " наелся, повторите через 5 часов";



    @BeforeEach
    void setUp(){
        lion = new Lion(name,weight);
        stream = mock(PrintStream.class);
        captor = ArgumentCaptor.forClass(String.class);
    }

    @DisplayName("Кормление льва нужной едой в")
    @Test
    void shouldEatHisEat() {

        System.setOut(stream);

        lion.eat(new Chicken(10));

        verify(stream).println(captor.capture());
        assertEquals(captor.getValue(), name + FULL_ANIMAL );

    }

}
