package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;




public class QuadTrimDependTest {
        QuadTrimDepend first = new QuadTrimDepend(1, 2, 1);
        QuadTrimDepend second = new QuadTrimDepend(2, -7, 3);
        QuadTrimDepend third = new QuadTrimDepend(2, 2, 2);


        @Test
        public void FirstTest(){
            double answer = -1;
            assertEquals(first.higherDecision(), answer, 0.1);
        }

        @Test
        public void higherDecision(){
            double answer = 3;
            assertEquals(second.higherDecision(), answer, 0.1);
        }

        @Test(expected = IllegalArgumentException.class)
        public void ThirdTest() {
            third.higherDecision();
        }
}