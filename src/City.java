public class City implements Comparable<City>{
    private int cod;
    private String name;

    public City(int cod, String name) {
        this.cod = cod;
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(City cod) {
        if (this.cod == cod.getCod()) {
            return 0;
        } else if (this.cod > cod.getCod()) {
            return -1;
        } else
            return 1;
    }
    }

