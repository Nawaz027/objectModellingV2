package com.crio.codingame.commands;

import java.util.List;
import java.util.stream.Collectors;
import com.crio.codingame.entities.Contest;
import com.crio.codingame.entities.Level;
import com.crio.codingame.entities.Question;
import com.crio.codingame.repositories.ContestRepository;
import com.crio.codingame.services.IContestService;

public class ListContestCommand implements ICommand{

    private final IContestService contestService;
    
    public ListContestCommand(IContestService contestService) {
        this.contestService = contestService;
    }

    // TODO: CRIO_TASK_MODULE_CONTROLLER
    // Execute getAllContestLevelWise method of IContestService and print the result.
    // Look for the unit tests to see the expected output.
    // Sample Input Token List:- ["LIST_CONTEST","HIGH"]
    // or
    // ["LIST_CONTEST"]

    @Override
    public void execute(List<String> tokens) {
        if (tokens.size() == 1) {
            List<Contest> contestList = contestService.getAllContestLevelWise(null);
            System.out.println(contestList);
            return;
        }
        String level = tokens.get(1);
        List<Contest> contestList = contestService.getAllContestLevelWise(Level.valueOf(level));
        System.out.println(contestList);

    }   
}
// ContestSummaryDto contestSummaryDto = contestService.runContest(contestId, contestCreator);
// System.out.println(contestSummaryDto.getUsers().stream().map(u -> "[UserName:" + u.getName() + " [Questions: " + u.getQuestionsByContest(contestSummaryDto.getContest()) + "]" + "]" )
// .collect(Collectors.joining(", ")));
