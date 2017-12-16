package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Article;

/**
 * Created by PP on 12/7/2017.
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
