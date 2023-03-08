package model.toys;

public class SoftToy extends Toy {
    private String toyType;

    public SoftToy(Integer id, String name, Integer count, Integer weight) {
        super(id, name, count, weight);
        this.toyType = "Soft toy";
    }

    public String getToyType() {
        return toyType;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Integer getCount() {
        return super.getCount();
    }

    @Override
    public Integer getWeight() {
        return super.getWeight();
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setCount(Integer newCount) {
        super.setCount(newCount);
    }

    @Override
    public String toString() {
        return String.format("ID: %d %s \"%s\" Count: %d Chance to get: %d\n", this.getId(), this.toyType,
                this.getName(), this.getCount(), this.getWeight());
    }

    @Override
    public int compareTo(Toy o) {
        return super.compareTo(o);
    }

    @Override
    public SoftToy clone() throws CloneNotSupportedException {
        return (SoftToy) super.clone();
    }

    @Override
    public void setWeight(Integer weight) {
        super.setWeight(weight);
    }
}