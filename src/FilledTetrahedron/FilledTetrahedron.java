/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksForCourseApply2;

import static java.util.Arrays.sort;

/**
 *
 * @author Darkstar
 */
public class FilledTetrahedron {

    public static double fill_tetrahedron(int num) {
        double volume;
        volume = ((Math.sqrt(2) * Math.pow(num, 3)) / 12);
        return volume / 1000;
    }

    public static int tetrahedron_filled(int[] tetrahedrons, int water) {
        sort(tetrahedrons);

        int i = 0;
        while (fill_tetrahedron(tetrahedrons[i]) < water) {
            water = water - (int)fill_tetrahedron(tetrahedrons[i]);
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] tetrahedrons = {100, 20, 30};
        int liters_of_water = 10;
        int filled_tetrahedrons = tetrahedron_filled(tetrahedrons, liters_of_water);
        System.out.printf("You can fill %d tetrahedrons with %d liters of water.\n", filled_tetrahedrons, liters_of_water);
    }
}
