package edu.tcu.cs.hogwartsartifactonline.datainitializer;

import edu.tcu.cs.hogwartsartifactonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactonline.domain.Artifact;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {

    private ArtifactDao artifactDao;

    public DBDataInitializer(ArtifactDao artifactDao) {
        this.artifactDao = artifactDao;
    }

    @Override
    public void run(String... args) throws Exception {
        Artifact a1 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A Deluminator is a device...");
        a1.setImageURL("imageURL");

        Artifact a2 = new Artifact();
        a2.setId("1250808601744904193");
        a2.setName("Invisibility Cloak");
        a2.setDescription("An invisibility cloak is used to make the wearer invisible.");
        a2.setImageURL("imageURL");

        Artifact a3 = new Artifact();
        a3.setId("1250808601744904192");
        a3.setName("Elder Wand");
        a3.setDescription("The Elder Wand, known throughout history as the Deathstick or the Wand of Destiny, is an extremely powerful wand made of elder wood with a core of Thestral tail hair.");
        a3.setImageURL("imageURL");

        Artifact a4 = new Artifact();
        a4.setId("1250808601744904194");
        a4.setName("The Marauder's Map");
        a4.setDescription("A magical map of Hogwarts created by Remus Lupin, Peter Pettigrew, Sirius Black, and James Potter while they were students at Hogwarts.");
        a4.setImageURL("imageURL");

        Artifact a5 = new Artifact();
        a5.setId("1250808601744904195");
        a5.setName("The Sword Of Gryffindor");
        a5.setDescription("A goblin-made sword adorned with large rubies on the pommel. It was once owned by Godric Gryffindor, one of the medieval founders of Hogwarts.");
        a5.setImageURL("imageURL");

        Artifact a6 = new Artifact();
        a6.setId("1250808601744904196");
        a6.setName("Resurrection Stone");
        a6.setDescription("The Resurrection Stone allows the holder to bring back deceased loved ones, in a semi-physical form, and communicate with them.");
        a6.setImageURL("imageURL");
        artifactDao.save(a1);
        artifactDao.save(a2);
        artifactDao.save(a3);
        artifactDao.save(a4);
        artifactDao.save(a5);
        artifactDao.save(a6);

    }
}
