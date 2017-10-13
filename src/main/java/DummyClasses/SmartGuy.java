package DummyClasses;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SmartGuy {
    private int id;
    private String name;
    private DumbGuy dumbGuy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DumbGuy getDumbGuy() {
        return dumbGuy;
    }

    public void setDumbGuy(DumbGuy dumbGuy) {
        this.dumbGuy = dumbGuy;
    }
}
