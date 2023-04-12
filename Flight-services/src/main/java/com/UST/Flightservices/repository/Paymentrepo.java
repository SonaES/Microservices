package com.UST.Flightservices.repository;

import com.UST.Flightservices.entity.Paymentinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Paymentrepo extends JpaRepository<Paymentinfo,String> {

}
