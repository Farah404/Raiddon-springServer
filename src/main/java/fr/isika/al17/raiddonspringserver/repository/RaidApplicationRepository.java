package fr.isika.al17.raiddonspringserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.isika.al17.raiddonspringserver.models.RaidApplication;

@Repository
public interface RaidApplicationRepository extends JpaRepository <RaidApplication, Long> {
    
}