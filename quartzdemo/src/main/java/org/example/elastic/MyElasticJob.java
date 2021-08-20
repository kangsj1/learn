package org.example.elastic;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/18
 * @modified by:
 */
public class MyElasticJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println(String.format("thread---:%s,任务总分片数---%s,分片项---%s",Thread.currentThread().getId(),shardingContext.getShardingTotalCount(),shardingContext.getShardingItem()));
    }
}
