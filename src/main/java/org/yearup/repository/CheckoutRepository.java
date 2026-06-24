package org.yearup.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yearup.models.Checkout;
import org.yearup.models.Profile;

@Repository
public interface CheckoutRepository extends JpaRepository<Profile, Integer>
{
}

