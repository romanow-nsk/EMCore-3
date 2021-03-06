package romanow.abc.core.entity.subjectarea;

import lombok.Getter;
import lombok.Setter;
import romanow.abc.core.entity.EntityLink;
import romanow.abc.core.entity.EntityLinkList;
import romanow.abc.core.entity.EntityRefList;

public class EMExamRule extends EMNamedEntity {
    @Getter private EntityLink<EMDiscipline> EMDiscipline = new EntityLink<>();                 // Обратная ссылка
    @Getter private EntityLinkList<EMTheme> themes = new EntityLinkList<>(EMTheme.class);
    @Getter @Setter private int minimalRating=30;               // Рейтинг для допуска
    @Getter @Setter private int examOwnRating=40;               // Собственный рейтинг экзамена/зачета
    @Getter @Setter private int examDuration=180;               // Продолжительность в минутах
    @Getter @Setter private int oneQuestionDefBall=2;           // Балл по умолчанию за тест
    @Getter @Setter private int oneExcerciceDefBall=10;         // Балл по умолчанию за задачу
    @Getter @Setter private int questionRating=20;              // Суммарный балл  за тест
    @Getter @Setter private int excerciceRating=20;             // Суммарный балл  за задачу
    public EMExamRule(){}
    }
