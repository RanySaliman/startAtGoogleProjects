package Day6.Exc3;

public interface Visitor {
    void visit(Asset asset);
    void visit(Group group);
    void visit(User user);
}
