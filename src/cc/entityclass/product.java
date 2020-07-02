package cc.entityclass;

public class product {
	private String name;            // 类别名称
    private int num;                // 销量

    public product(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", num=" + num + "]";
    }

}
