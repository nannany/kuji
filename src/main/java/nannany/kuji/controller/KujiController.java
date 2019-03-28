package nannany.kuji.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nannany.kuji.entity.Assignment;
import nannany.kuji.vo.Role;

@RestController
public class KujiController {

	@GetMapping("kuji")
	public List<Assignment> getResult(@RequestParam(name = "name", required = true) String names) {
		List<Role> roles = new ArrayList<>(Arrays.asList(Role.SCRUM_MUSTER, Role.PRODUCT_OWNER));
		List<String> nameList = Arrays.asList(names.split("-"));

		if (nameList.size() < 2) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < nameList.size() - 2; i++) {
			roles.add(Role.DEVELOPER);
		}

		Collections.shuffle(roles);

		List<Assignment> ret = new ArrayList<>();
		for (int i = 0; i < nameList.size(); i++) {

			ret.add(new Assignment(nameList.get(i), roles.get(i)));
		}

		return ret;
	}

}
