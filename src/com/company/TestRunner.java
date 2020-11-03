package com.company;

public class TestRunner {
    public void Run(){
        RunOrchestra();
        RunInstruments();

    }

    public void RunInstruments(){


        Accordion a1 = new Accordion("Fox");
        Cello c1 = new Cello("Mike");
        Harp h1 = new Harp("Petrov");
        Maracas m1 = new Maracas("Pinkerton");
        Piano p1 = new Piano("Sherlock");
        Saxophone s1 = new Saxophone("Black");
        Tuba t1 = new Tuba("Lee");
        Xylophone x1 = new Xylophone("Braun");
        MessageCenter.DebugMessage(String.format("a1 owner is: %s", a1.getOwner()));
        MessageCenter.DebugMessage(a1.toString());



        a1.Value(2566, "USA");
        c1.Value(8566, "Japan");
        h1.Value(10566, "Germany");
        m1.Value(56566, "Ireland");
        p1.Value(89566, "Russia");
        s1.Value(9666, "Italy");
        t1.Value(12566, "Finland");
        x1.Value(156566, "China");

    }

    public void RunOrchestra(){
        Orchestra orch = new Orchestra();
        Accordion a1 = new Accordion();
        Cello c1 = new Cello();
        Harp h1 = new Harp();
        Maracas m1 = new Maracas();
        Piano p1 = new Piano();
        Saxophone s1 = new Saxophone();
        Tuba t1 = new Tuba();
        Xylophone x1 = new Xylophone();

        orch.OrchInstruments(a1);
        orch.OrchInstruments(c1);
        orch.OrchInstruments(h1);
        orch.OrchInstruments(m1);
        orch.OrchInstruments(p1);
        orch.OrchInstruments(s1);
        orch.OrchInstruments(t1);
        orch.OrchInstruments(x1);

        MessageCenter.DebugMessage(orch.toString());


    }

}
