package com.haw.se1lab.chat.datenzugriff.api.repo;

import com.haw.se1lab.chat.datenzugriff.api.entitaeten.ChatNachricht;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatNachrichtRepo extends JpaRepository<ChatNachricht, Long> {
}
