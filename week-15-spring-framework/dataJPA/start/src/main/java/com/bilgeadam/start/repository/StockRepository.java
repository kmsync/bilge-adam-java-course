package com.bilgeadam.start.repository;

import com.bilgeadam.start.model.entity.Stock;
import com.bilgeadam.start.repository.projections.StockProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
// Select S from Stock S;
public interface StockRepository extends JpaRepository<Stock,Long> {

    // select * from stock where quantity = 500;
    List<Stock> findByQuantity(Integer quantity);

    // select * from stock where quantity = 500 limit 1;
    Optional<Stock> findTopByQuantity(Integer quantity);

    // select * from stock where quantity < 500;
    List<Stock> findByQuantityLessThan(Integer quantity);

    // select * from stock where quantity < 500;
    List<Stock> getByQuantityLessThan(Integer quantity);

    // delete from stock where barcode = x;
    void deleteByBarcode(Long barcode);

    // select * from stock where barcode = x order by quantity desc;
    List<Stock> findByBarcodeOrderByQuantityDesc(Long quantity);

    // select * from stock where barcode = x order by quantity asc;
    List<Stock> findByBarcodeOrderByQuantityAsc(Long quantity);

    //select * from stock where isAlive = true;
    Boolean findByIsAliveIsTrue();

    // select * from stock where isAlive=true;
    Optional<Stock> findByIsAliveTrue();

    // select * from stock where quantity in (5,6,7);
    List<Stock> findByQuantityIn(List<Integer> quantites);

    // select distinct(*) from stock where barcode = x;
    List<Stock> findDistinctByBarcode(Long barcode);

    // select distinct * from stock where barcode = a and stock_code = b;
    List<Stock> findDistinctByBarcodeAndStockCode(Long a , Long b);

    // select * from stock limit 3;
    List<Stock> findFirst3ByBarcode(Long barcode);

    // select * from stock order by quantity desc limit 4;
    List<Stock> findFirst4ByQuantityOrderByQuantityDesc(Integer quantity);

    // select count(*) from stock where quantity=x;
    Integer countByQuantity(Integer quantity);

    // select name, barcode from stock where barcode=?
    List<StockProjection> findByBarcode(Long barcode);

    //select count(id) from stock Bu sorgu Stock Entity'sinde bulunan @NamedQuery Anotasyonu sayesinde geldi.
    Integer say();

    @Query(value = "SELECT S FROM Stock S where S.stockCode=:stockCode") // JPQL
    List<Stock> a(@Param("stockCode") Long stockCode);

    @Query(value = "select * from stock where stock_code=:stockCode",nativeQuery = true) // SQL
    List<Stock> b(@Param("stockCode") Long stockCode);
}
