package edu.tcu.cs.hogwartsartifactonline.dao;

import edu.tcu.cs.hogwartsartifactonline.domain.Artifact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtifactDao extends JpaRepository<Artifact, String> {
}
