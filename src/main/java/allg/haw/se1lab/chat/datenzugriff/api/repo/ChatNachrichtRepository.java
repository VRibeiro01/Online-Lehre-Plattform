package allg.haw.se1lab.chat.datenzugriff.api.repo;

import allg.haw.se1lab.chat.datenzugriff.api.entitaeten.ChatNachricht;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatNachrichtRepository extends JpaRepository<ChatNachricht, Long> {
}
