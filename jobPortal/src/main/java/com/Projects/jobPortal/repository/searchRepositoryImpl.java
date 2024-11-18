package com.Projects.jobPortal.repository;

import ch.qos.logback.core.net.server.Client;
import com.Projects.jobPortal.entity.post;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import java.util.concurrent.TimeUnit;
import org.bson.Document;
import com.mongodb.client.AggregateIterable;

@Component
public class searchRepositoryImpl implements searchRepository {

    @Autowired
    MongoClient client;

    @Autowired
    MongoConverter converter;

    @Override
    public List<post> findByText(String text) {
      final List<post> posts = new ArrayList<>();

        MongoDatabase database = client.getDatabase("shubhgupta");
        MongoCollection<Document> collection = database.getCollection("JobPost");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                                new Document("text",
                                new Document("query", text)
                                .append("path", Arrays.asList("skills", "profile","techs","desc")))),
                                new Document("$sort",
                                new Document("exp",1L)),
                                new Document("$limit", 10L)));

        result.forEach(doc->posts.add(converter.read(post.class,doc)));
      return posts;
    }


}
