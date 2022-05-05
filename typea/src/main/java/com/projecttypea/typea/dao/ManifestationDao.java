package com.projecttypea.typea.dao;

import com.projecttypea.typea.bean.Manifestation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManifestationDao extends JpaRepository<Manifestation, Long> {

}
