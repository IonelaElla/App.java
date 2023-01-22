package ro.siit.gad.session6.generics;

public class OldSanta {
    public static void main(String[] args) {
        Box box = new Box();
        box.setContent(new Present("Hoverboard"));
        Present present = (Present)(box.getContent());
        System.out.println(present.getName());

        box.setContent(new Tool("In-house"));
        Tool tool = (Tool)(box.getContent());
        Present parentPresent = (Present)(box.getContent());
        System.out.println(tool.getUsage());
    }
}
