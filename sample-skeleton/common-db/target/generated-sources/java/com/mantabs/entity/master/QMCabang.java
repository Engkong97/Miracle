package com.mantabs.entity.master;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMCabang is a Querydsl query type for MCabang
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMCabang extends EntityPathBase<MCabang> {

    private static final long serialVersionUID = -1509724449L;

    public static final QMCabang mCabang = new QMCabang("mCabang");

    public final StringPath idCabang = createString("idCabang");

    public final StringPath idRegional = createString("idRegional");

    public final StringPath idWilayah = createString("idWilayah");

    public final StringPath kelasCabang = createString("kelasCabang");

    public final StringPath namaCabang = createString("namaCabang");

    public QMCabang(String variable) {
        super(MCabang.class, forVariable(variable));
    }

    public QMCabang(Path<? extends MCabang> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMCabang(PathMetadata metadata) {
        super(MCabang.class, metadata);
    }

}

