package Day6.Exc3;

public class CleaningVisitor implements Visitor{
    @Override
    public void visit(Group group) {
        System.out.printf("Cleaning the oven %s\n", group);
    }

    @Override
    public void visit(User user) {
        System.out.printf("Cleaning the foodProcessor %s\n", user);
    }

    @Override
    public void visit(Asset asset) {
        System.out.printf("Cleaning the microwave %s\n", asset);

    }
}