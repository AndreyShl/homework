package pract.preparePract;

public class Alpha {
    Alpha doStuff() {
        return new Alpha();
    }
}
class Beta extends Alpha { // 1
    Beta doStuff() { // 2
        return new Beta(); // 3
    }
}
