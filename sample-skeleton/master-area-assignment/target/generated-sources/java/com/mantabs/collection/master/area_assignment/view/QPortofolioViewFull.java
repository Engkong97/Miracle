package com.mantabs.collection.master.area_assignment.view;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPortofolioViewFull is a Querydsl query type for PortofolioViewFull
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPortofolioViewFull extends EntityPathBase<PortofolioViewFull> {

    private static final long serialVersionUID = -2102493526L;

    public static final QPortofolioViewFull portofolioViewFull = new QPortofolioViewFull("portofolioViewFull");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDt = createDateTime("createdDt", java.util.Date.class);

    public final StringPath idCabang = createString("idCabang");

    public final StringPath idCentro = createString("idCentro");

    public final StringPath idRegional = createString("idRegional");

    public final StringPath idWilayah = createString("idWilayah");

    public final StringPath jabatan = createString("jabatan");

    public final StringPath kategoriProduk = createString("kategoriProduk");

    public final StringPath modifiedBy = createString("modifiedBy");

    public final DateTimePath<java.util.Date> modifiedDt = createDateTime("modifiedDt", java.util.Date.class);

    public final StringPath namaCabang = createString("namaCabang");

    public final StringPath namaCentro = createString("namaCentro");

    public final StringPath namaKaryawan = createString("namaKaryawan");

    public final StringPath namaRegional = createString("namaRegional");

    public final StringPath namaWilayah = createString("namaWilayah");

    public final StringPath portofolio = createString("portofolio");

    public final StringPath status = createString("status");

    public QPortofolioViewFull(String variable) {
        super(PortofolioViewFull.class, forVariable(variable));
    }

    public QPortofolioViewFull(Path<? extends PortofolioViewFull> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPortofolioViewFull(PathMetadata metadata) {
        super(PortofolioViewFull.class, metadata);
    }

}

