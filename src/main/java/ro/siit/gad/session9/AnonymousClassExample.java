package ro.siit.gad.session9;

public class AnonymousClassExample {
    public static void main(String[] args) {

        Executor painter = jobName -> {
            System.out.println("Start");
            System.out.println("I am painting " + jobName + "!");
            System.out.println("Stop");
        };

        painter.doJob("a landscape");

        Executor driver = new Executor() {
            @Override
            public void doJob(String jobName) {
                System.out.println("I am driving " + jobName);
            }
        };

        driver.doJob("a bus");

        Executor teacher = new Teacher();
        teacher.doJob("Biology");
    }
}
