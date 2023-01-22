package ro.siit.gad.session6.generics;

public class NewSanta {
    public static void main(String[] args) {
        GenericBox<Present> presentBox = new GenericBox<>();
        presentBox.setContent(new Present("Hoverboard"));
        System.out.println(presentBox.getContent().getName());

        GenericBox<Tool> toolBox = new GenericBox<>();
        toolBox.setContent(new Tool("In-house"));
        System.out.println(toolBox.getContent().getUsage());
    }
}
