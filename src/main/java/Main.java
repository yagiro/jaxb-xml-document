import DummyClasses.DumbGuy;
import DummyClasses.Interest;
import DummyClasses.Pet;
import DummyClasses.SmartGuy;
import Utils.XmlHelper;
import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SmartGuy smartGuy = createDummyObject();
        String xmlString = XmlHelper.toXmlString(smartGuy, SmartGuy.class);
        Document document = XmlHelper.toDocument(smartGuy, SmartGuy.class);
    }

    private static SmartGuy createDummyObject() {
        SmartGuy smartGuy = new SmartGuy();
        smartGuy.setId(1);
        smartGuy.setName("Shuki");
        smartGuy.setDumbGuy(createDumbGuy());
        return smartGuy;
    }

    private static DumbGuy createDumbGuy() {
        DumbGuy dumbGuy = new DumbGuy();
        dumbGuy.setIq(5);
        dumbGuy.setPets(createPets(dumbGuy));
        dumbGuy.setInterests(createInterests());
        return dumbGuy;
    }

    private static List<Interest> createInterests() {
        List<Interest> interests = new ArrayList<Interest>();
        interests.add(new Interest(1, "Ski", 96));
        interests.add(new Interest(2, "Soccer", 32));
        interests.add(new Interest(3, "Swimming", 58));
        return interests;
    }

    private static HashMap<String, Pet> createPets(DumbGuy owner) {
        HashMap<String, Pet> pets = new HashMap<String, Pet>();
        pets.put("Chuck", new Pet("Chuck", owner, 4));
        pets.put("Inka", new Pet("Inka", owner, 7));
        return pets;
    }
}
