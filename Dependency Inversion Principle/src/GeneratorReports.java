public class GeneratorReports {
    private final Generator generator;

    public GeneratorReports(Generator generator) {
        this.generator = generator;
    }

    public void generate() {
        generator.export();
    }

}