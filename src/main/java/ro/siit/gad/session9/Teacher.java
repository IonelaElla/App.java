package ro.siit.gad.session9;

public class Teacher implements Executor{
    @Override
    public void doJob(String jobName) {
        System.out.println("I am teaching "  + jobName);
    }
}
