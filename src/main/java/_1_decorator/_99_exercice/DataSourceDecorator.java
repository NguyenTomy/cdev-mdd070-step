package _1_decorator._99_exercice;

public class DataSourceDecorator implements DataSource {

    protected DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void writeData(String data) {
        dataSource.writeData(data);
    }

    public String readData() {
        return dataSource.readData();
    }
}
