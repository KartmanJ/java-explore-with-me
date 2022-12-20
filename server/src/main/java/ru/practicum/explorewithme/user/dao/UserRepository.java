package ru.practicum.explorewithme.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.practicum.explorewithme.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}