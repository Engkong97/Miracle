package com.mantabs.entity.master;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMKontributor is a Querydsl query type for MKontributor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMKontributor extends EntityPathBase<MKontributor> {

    private static final long serialVersionUID = 1580065082L;

    public static final QMKontributor mKontributor = new QMKontributor("mKontributor");

    public final StringPath creBy = createString("creBy");

    public final StringPath creDate = createString("creDate");

    public final StringPath employeeCode = createString("employeeCode");

    public final StringPath firstName = createString("firstName");

    public final StringPath idTrainer = createString("idTrainer");

    public final StringPath imgTrainer = createString("imgTrainer");

    public final StringPath lastName = createString("lastName");

    public final StringPath modBy = createString("modBy");

    public final StringPath modDate = createString("modDate");

    public final StringPath namaJabatan = createString("namaJabatan");

    public final StringPath titleTrainer = createString("titleTrainer");

    public QMKontributor(String variable) {
        super(MKontributor.class, forVariable(variable));
    }

    public QMKontributor(Path<? extends MKontributor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMKontributor(PathMetadata metadata) {
        super(MKontributor.class, metadata);
    }

}

