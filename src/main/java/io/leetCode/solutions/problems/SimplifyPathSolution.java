package io.leetCode.solutions.problems;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Stack;

/**
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.
 * <p>
 * In a Unix-style file system, a period '.' refers to the current directory,
 * a double period '..' refers to the directory up a level, and any multiple consecutive
 * slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format
 * of periods such as '...' are treated as file/directory names.
 * <p>
 * The canonical path should have the following format:
 * <p>
 * The path starts with a single slash '/'.
 * Any two directories are separated by a single slash '/'.
 * The path does not end with a trailing '/'.
 * The path only contains the directories on the path from the root directory to the target
 * file or directory (i.e., no period '.' or double period '..')
 * Return the simplified canonical path.
 */
@Service
@Slf4j
public class SimplifyPathSolution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        String res = "";
        if (stack.empty()) {
            return "/";
        } else {
            while (!stack.empty()) {
                res = "/" + stack.pop() + res;
            }
            log.info("Canonical Path = {}", res);
            return res;
        }
    }
}