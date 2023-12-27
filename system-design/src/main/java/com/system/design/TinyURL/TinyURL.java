package com.system.design.TinyURL;

// 短网址服务可以把一个长网址变成短网址，方便在社交网络上传播
// TODO: 长度不超过7的字符串，由大小写字母加数字共62个字母组成
//       62^7 = 3521614606208，这个量级远远超过互联网上的URL总数
// 1. URL中字符是区别大小写的
// 2. 一个长网址，在不同的地点，不同的用户等情况下，生成的短网址应该不一样 ==> 方便数据挖掘分析

public class TinyURL {

    // 如何计算短网址 ? 分布式ID发号器, 生成长度为7的字符串
    // 如何存储短网址 ? 任意一个分布式KV数据库, <TinyURL, FullURL>键值存储结构

    // 如果避免短网址耗光 ?
    // 1. 限制IP的单日请求总数，超过阈值则直接拒绝服务
    // 2. Redis缓存服务器，缓存一天中<长网址，ID>的数据，对同一个长网址，不再耗费ID
}
