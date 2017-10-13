package DummyClasses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.HashMap;
import java.util.List;

@XmlRootElement
public class DumbGuy {
    private int iq;
    private HashMap<String, Pet> pets;

    @XmlElementWrapper(name="interests")
    @XmlElement(name="interest")
    private List<Interest> interests;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public HashMap<String, Pet> getPets() {
        return pets;
    }

    public void setPets(HashMap<String, Pet> pets) {
        this.pets = pets;
    }

    @XmlTransient
    public List<Interest> getInterests() {
        return interests;
    }

    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }
}
