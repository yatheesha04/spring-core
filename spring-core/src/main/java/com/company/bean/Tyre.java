package com.company.bean;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

		String name;

		public Tyre() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Tyre(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Tyre [name=" + name + "]";
		}

		
	}


