package com.nikitagordia.kpi;

public class CircleController {

    private View view;

    public CircleController() {
        view = new View();
    }

    public void run() {
        String input = view.read();
        int n;
        try {
            n = Integer.valueOf(input);
        } catch (Exception e) {
            view.alert("Wrong number");
            return;
        }

        CircleContainer container = new CircleContainer(n);

        view.alert(container.formatSet());
        view.alert("Scanning started");
        view.alert(container.scan());
        view.alert("Scanning finished");
    }
}
