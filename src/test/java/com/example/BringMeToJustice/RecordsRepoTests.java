package com.example.BringMeToJustice;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class RecordsRepoTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    RecordsRepo repo;

    @Test
    public void testCreateRecord(){
        Records record = new Records();
        record.setTitle("Report1");
        record.setDate("4/27/21");
        record.setReportNumber(332331144);
        record.setVictimName("Bob");
        record.setHasSuspect(true);
        record.setSuspect1Name("John Smith");
        record.setSuspect1Hair("Blonde");
        record.setSuspect1Eye("Blue");
        record.setSuspect1Race("White");
        record.setSuspect2Name("Parker Jones");
        record.setSuspect2Hair("Brown");
        record.setSuspect2Eye("Brown");
        record.setSuspect2Race("White");
        record.setSuspect3Name("Aaron Johnson");
        record.setSuspect3Hair("Black");
        record.setSuspect3Eye("Green");
        record.setSuspect3Race("White");
        record.setSuspect4Name("Jeremiah Brown");
        record.setSuspect4Hair("Gray");
        record.setSuspect4Eye("Gray");
        record.setSuspect4Race("White");
        record.setSuspect5Name("Sean Alexander");
        record.setSuspect5Hair("Black");
        record.setSuspect5Eye("Brown");
        record.setSuspect5Race("Black");
        record.setHasWarrants(false);
        record.setWhoHasWarrants(null);
        record.setSuspect1WarrantDate(null);
        record.setSuspect1WarrantDescription(null);
        record.setSuspect2WarrantDate(null);
        record.setSuspect2WarrantDescription(null);
        record.setSuspect3WarrantDate(null);
        record.setSuspect3WarrantDescription(null);
        record.setSuspect4WarrantDate(null);
        record.setSuspect4WarrantDescription(null);
        record.setSuspect5WarrantDate(null);
        record.setSuspect5WarrantDescription(null);
        record.setDescriptionOfReport("Bob was assaulted and robbed at gunpoint by these five gentlemen after an altercation broke out in a public bar.");
        Records savedRecord = repo.save(record);
        Records existRecord = entityManager.find(Records.class, savedRecord.getId());
        assertThat(record.getTitle()).isEqualTo(existRecord.getTitle());

    }

}
