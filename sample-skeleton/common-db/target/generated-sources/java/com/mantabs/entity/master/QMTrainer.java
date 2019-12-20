package com.mantabs.entity.master;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMTrainer is a Querydsl query type for MTrainer
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMTrainer extends EntityPathBase<MTrainer> {

    private static final long serialVersionUID = -1163113844L;

    public static final QMTrainer mTrainer = new QMTrainer("mTrainer");

    public final StringPath creBy = createString("creBy");

    public final StringPath creDate = createString("creDate");

    public final StringPath email = createString("email");

    public final StringPath employeeCode = createString("employeeCode");

    public final StringPath firstName = createString("firstName");

    public final StringPath idTrainer = createString("idTrainer");

    public final StringPath lastName = createString("lastName");

    public final StringPath modBy = createString("modBy");

    public final StringPath modDate = createString("modDate");

    public final StringPath titleTrainer = createString("titleTrainer");

    public QMTrainer(String variable) {
        super(MTrainer.class, forVariable(variable));
    }

    public QMTrainer(Path<? extends MTrainer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMTrainer(PathMetadata metadata) {
        super(MTrainer.class, metadata);
    }

}

