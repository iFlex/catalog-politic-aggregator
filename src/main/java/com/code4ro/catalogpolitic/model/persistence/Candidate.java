package com.code4ro.catalogpolitic.model.persistence;

import com.code4ro.catalogpolitic.model.persistence.sattelites.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Candidate {
    private PersonalProfile profile;
    private Traseism politicalParties;
    private List<PoliticalProfile> politicalProfile;
    private Avere wealth;
    private Dna dnaData;
}
