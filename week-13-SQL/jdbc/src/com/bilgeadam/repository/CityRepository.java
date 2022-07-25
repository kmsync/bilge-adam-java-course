package com.bilgeadam.repository;

import com.bilgeadam.model.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityRepository {
    private final Connection connection;

    public CityRepository(Connection connection){
        this.connection = connection;
    }

    public List<City> findAllCity(){
        List<City> cities = new ArrayList<>();
        try (Statement statement = this.connection.createStatement()){
            statement.executeQuery("select * from city");
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()){
                City city = new City();
                city.setId(resultSet.getInt("city_id"));
                city.setCity(resultSet.getString(2));
                cities.add(city);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return cities;
    }

    public void saveCity(City city){
        String sql = "insert into city(city, country_id, last_update) values (?,?,?)";
        try (PreparedStatement statement = this.connection.prepareStatement(sql)){
            statement.setString(1,city.getCity());
            statement.setInt(2,city.getCountryId());
            statement.setDate(3,city.getLastUpdate());
            statement.executeUpdate();
        } catch (SQLException sqlException){
            System.err.println(sqlException.getMessage());
        }
    }

    public void deleteCityById(Integer id){
        String sql = "delete from city where city_id="+id;
        try (Statement statement = this.connection.createStatement()){
            statement.executeUpdate(sql);
            System.out.println(id + " numaralı kayıt silindi.");
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }

    public Integer findLastCityRecord(){
        String sql = "select city_id from city order by last_update desc limit 1";
        try (Statement statement = this.connection.createStatement()){
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                return resultSet.getInt(1);
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
}
