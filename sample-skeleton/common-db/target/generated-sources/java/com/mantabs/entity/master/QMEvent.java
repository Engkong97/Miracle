package com.mantabs.entity.master;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMEvent is a Querydsl query type for MEvent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMEvent extends EntityPathBase<MEvent> {

    private static final long serialVersionUID = -46224847L;

    public static final QMEvent mEvent = new QMEvent("mEvent");

    public final StringPath creBy = createString("creBy");

    public final StringPath creDate = createString("creDate");

    public final StringPath IdEmployee = createString("IdEmployee");

    public final NumberPath<Integer> idEvent = createNumber("idEvent", Integer.class);

    public final StringPath Isi = createString("Isi");

    public final StringPath Judul = createString("Judul");

    public final StringPath modBy = createString("modBy");

    public final StringPath modDate = createString("modDate");

    public final StringPath PathImg = createString("PathImg");

    public final StringPath positionCode = createString("positionCode");

    public final DateTimePath<java.util.Date> tglEvent = createDateTime("tglEvent", java.util.Date.class);

    public final StringPath Type = createString("Type");

    public QMEvent(String variable) {
        super(MEvent.class, forVariable(variable));
    }

    public QMEvent(Path<? extends MEvent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMEvent(PathMetadata metadata) {
        super(MEvent.class, metadata);
    }

}

