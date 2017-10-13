package DummyClasses;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Pet {
    private String name;
    @XmlTransient private DumbGuy owner;
    private int age;

    public Pet() {}

    public Pet(String name, DumbGuy owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public DumbGuy getOwner() {
        return owner;
    }

    public void setOwner(DumbGuy owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
