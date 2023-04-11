package com.hitachi.constructorInjection;

import java.util.List;

public class InfinityStones {
    private List<String> stones;
    private String source;

    public InfinityStones() {}

    public InfinityStones(List<String> stones, String source) {
        this.stones = stones;
        this.source = source;
    }

    public void snap() {
        System.out.print("Adding ");
        for (String stone : stones) {
            System.out.print(stone + ", ");
        }
        System.out.print("in gauntlet !! \n");


        System.out.println("Thanos : I am inevitable : " + source);
    }
}

/**Output:
 * Adding Space Stone, Mind Stone, Reality Stone, Power Stone, Time Stone, Soul Stone, in gauntlet !!
 * Thanos : I am inevitable : https://www.youtube.com/watch?v=t-_PfdQ0DYo
 */