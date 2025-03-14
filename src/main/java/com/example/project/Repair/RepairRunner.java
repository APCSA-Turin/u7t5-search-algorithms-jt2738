package com.example.project.Repair;
import java.util.ArrayList;
public class RepairRunner {
    public static void main(String[] args) {
        RepairSchedule schedule = new RepairSchedule(3); 
        ArrayList<Integer> availableMechanics = schedule.availableMechanics();
        System.err.println(availableMechanics);
        schedule.addRepair(0, 1);
        availableMechanics = schedule.availableMechanics();
        System.out.println(availableMechanics);
        schedule.addRepair(1, 2);
        System.out.println(availableMechanics);
        availableMechanics = schedule.availableMechanics();
        System.out.println(availableMechanics);
        schedule.addRepair(2, 3);
        availableMechanics = schedule.availableMechanics();
        System.out.println(availableMechanics);
    }
}