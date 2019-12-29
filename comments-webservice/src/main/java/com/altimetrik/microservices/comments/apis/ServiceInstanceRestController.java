//package com.altimetrik.microservices.comments.apis;
//
//import com.netflix.appinfo.InstanceInfo;
//import com.netflix.discovery.DiscoveryClient;
//import com.netflix.discovery.shared.Application;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//	 class ServiceInstanceRestController {
//		@Autowired
//		private DiscoveryClient discoveryClient;
//
//
//		@RequestMapping("/service-instances")
//		public List<String> serviceInstancesByApplicationName() {
//
//			List<Application> applications = discoveryClient.getApplications().getRegisteredApplications();
//			List<String> urlList = new ArrayList<String>() ;
//
//			for (Application application : applications) {
//				List<InstanceInfo> applicationsInstances = application.getInstances();
//				for (InstanceInfo applicationsInstance : applicationsInstances) {
//					urlList.add(applicationsInstance.getAppName()+applicationsInstance.getHomePageUrl());
//
//
//					String name = applicationsInstance.getAppName();
//					String url = applicationsInstance.getHomePageUrl();
//					System.out.println(name + ": " + url);
//				}
//
//			}
//			return urlList;
//		}
//	}

